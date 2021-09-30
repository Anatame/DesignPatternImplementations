package com.company.strategy;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("Using JPEG Compressor");
    }
}
