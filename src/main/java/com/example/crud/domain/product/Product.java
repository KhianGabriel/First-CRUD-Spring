package com.example.crud.domain.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_product")
    private String id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "price_in_cents")
    private Float price_in_cents;

    public Product(RequestProductCreate requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }
}
