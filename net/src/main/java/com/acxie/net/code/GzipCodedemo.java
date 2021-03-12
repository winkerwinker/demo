package com.acxie.net.code;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/27 15:13
 */

public class GzipCodedemo {


    public static void convertGzip() throws IOException {
        String str = "\u001F�\b      \u0003�V�M-IT��V*.MNN-.V�*)*M�\u0001\n" +
                "\u0017\u0017'��*Y)�{+��(�$������\u0002 z�a\u00174   ";
        InputStream in_withcode = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        //Not in GZIP format
        GZIPInputStream gunzip = new GZIPInputStream(in_withcode);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }

        System.out.println(out.toString());
    }

    public static void main(String[] args) {
        try {
            GzipCodedemo.convertGzip();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
