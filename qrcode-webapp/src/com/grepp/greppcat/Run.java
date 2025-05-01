package com.grepp.greppcat;

import com.grepp.greppcat.domain.IndexController;
import com.grepp.greppcat.domain.QrCodeController;
import com.grepp.greppcat.servlet.ServletStorage;
import java.util.List;


// http://localhost:8989/qrcode/download?name=naver&content=www.naver.com
// http://localhost:8989


public class Run {

    public static void main(String[] args) {
        ServletStorage.init(
            List.of( new QrCodeController(),new IndexController()
            ));
        new TcpServer(8989,160).start();
    }


}
