package com.HMKPRO.COMMAPP.POSTENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "postdatainfo")

public class POST {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int postid;
        private String url;

        @Temporal(TemporalType.DATE)
        private Date date;


}
