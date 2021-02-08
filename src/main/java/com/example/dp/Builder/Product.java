package com.example.dp.Builder;

import lombok.Data;

@Data
public class Product {
        private String Part1;
        private String Part2;
        private String Part3;

        public void show(){
            System.out.println(Part1+Part2+Part3);
        }
}
