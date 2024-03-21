package com.spring.Leave.Mode;

import jakarta.persistence.*;
import lombok.Data;

import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Date;

@Entity
@Data
@Table(name="leaves")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int emp_id;
    @Column(name = "dates")
    private Date dates;

    @Column(name = "holly_days")
    private MonthDay holly_days;

    @Column(name = "emp_code")
    private MonthDay Days;

    @Column(name = "email")
    private YearMonth years;
}
