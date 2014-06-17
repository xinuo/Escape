package game.service;

import java.net.*;
import java.io.*;
import java.util.*;



public class login {

	private ServerSocket serverSocket;
	private ServerSocket sandboxServerSocket;
//	ArrayList<Object> sManager = new ArrayList<>();
	private final BManager bManager = new BManager();
	public login(){}
	
	void starServer()
	{
		try {
			serverSocket = new ServerSocket(8800);
//			sandboxServerSocket = new ServerSocket(843);
			System.out.println("服务器套接字已创建成功！");  
			while(true)
			{
				Socket socket = serverSocket.accept();
//				System.out.println("已经与客户端连接");  
				
//				String xml = "<?xml version=\"1.0\"?><cross-domain-policy><site-control permitted-cross-domain-policies=\"all\"/><allow-access-from domain=\"*\" to-ports=\"*\"/></cross-domain-policy>\0";
//
//				Socket sandboxSocket = sandboxServerSocket.accept();
//				BufferedReader br = new BufferedReader(new InputStreamReader(sandboxSocket.getInputStream(), "UTF-8"));
//				PrintWriter pw = new PrintWriter(sandboxSocket.getOutputStream());
//				char[] by = new char[22];
//				br.read(by, 0, 22);
//				String s = new String(by);
//				System.out.println("s="+s);
//				if (s.equals("<policy-file-request/>")) {
//					System.out.println("接收policy-file-request");
//					pw.print(xml);
//					pw.flush();
//					br.close();
//					pw.close();
//					sandboxSocket.close();
//				} 
				
				
				bManager.add(socket);
				System.out.println("已经连接客户端：" + bManager.size());
				if(socket != null)
				{
					J_Thread _thread = new J_Thread(socket);
					_thread.start();
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("sssstop~!");
		}
		finally
		{
			try {
//				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
	
	
	class J_Thread extends Thread
	{
		Socket socket;
		private DataInputStream reader;
		private DataOutputStream writer;
		J_Thread(Socket socket)
		{
			this.socket = socket;
			
		}
		public void run()
		{
//			System.out.println("来自客户端：");  
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));

				String msg;
				while((msg = br.readLine())!= null )
				{
//					System.out.println(msg);
					String[] _arr = msg.split("\\|");
//					System.out.println(_arr.length);
//					System.out.println(_arr);
					if(_arr.length != 0)
					{
						System.out.println(_arr[0] + ":" + _arr[1]);  
						//					wr.append("服务器收到你的信息："  
						//							+ msg + "\r\n");  
						//					wr.flush();
						bManager.sendtoAll(_arr[0] + ":" + _arr[1]);
					}
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
			
		}
	}
	
	class BManager extends Vector
	{
		public BManager() {
			// TODO Auto-generated constructor stub
		}
		
		void add(Socket sock)
		{
			super.add(sock);
		}
		
		void remove(Socket sock)
		{
			super.remove(sock);
		}
		
		synchronized void sendtoAll(String msg)
		{
			PrintWriter writer=null; 
			for(int i = 0;i<size();i++)
			{
				Socket socket;
				socket = (Socket)elementAt(i);
				
				try {
		        	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
		        	wr.append(msg + "\r\n");
		        	wr.flush();
				} catch (IOException e) {
					// TODO: handle exception
				}
			}
		}
	}
	
	
	
	
	
}
