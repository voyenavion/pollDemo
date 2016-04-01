package com.apress.domain;

import javax.persistence.*;

/**
 * Created by shaungould on 2/24/16.
 */

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column()
    private Long id;

    @ManyToOne
    @JoinColumn(name="OPTION_ID")
    private Option option;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
