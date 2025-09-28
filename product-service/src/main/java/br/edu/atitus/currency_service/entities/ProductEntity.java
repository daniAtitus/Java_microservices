package br.edu.atitus.currency_service.entities;

import jakarta.persistence.*;
import jdk.jfr.Threshold;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;

@Entity
@Table(name="tb_product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String brand;
    private String model;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCourrency() {
        return courrency;
    }

    public void setCourrency(String courrency) {
        this.courrency = courrency;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public double getConverterPrice() {
        return converterPrice;
    }

    public void setConverterPrice(double converterPrice) {
        this.converterPrice = converterPrice;
    }

    private double price;

    @Column(length = 3)
    private String courrency;

    private Integer stock;
    @Transient
    private String enviroment;

    private double converterPrice;

}
