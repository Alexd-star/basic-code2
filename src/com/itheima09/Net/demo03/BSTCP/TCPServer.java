package com.itheima09.Net.demo03.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建BS版本TCP服务器
    网页地址：http://127.0.0.1:8080/src/web/index.html
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket,和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        /*byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes))!=-1){
                            System.out.println(new String(bytes,0,len));
                        }*/
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        System.out.println(line);
                        String[] s = line.split(" ");
                        String htmlpath = s[1].substring(1);

                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
