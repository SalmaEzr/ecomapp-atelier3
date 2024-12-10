package org.sid.customerservice.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;
    private String Email;
}
