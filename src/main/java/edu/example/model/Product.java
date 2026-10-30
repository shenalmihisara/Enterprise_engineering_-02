package edu.example.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String name;
    private String description;
    private double price;
    private String imageUrl;
}
