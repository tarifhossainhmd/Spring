///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.model;
//
//import java.io.Serializable;
//import javax.persistence.Entity;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//
///**
// *
// * @author Java
// */
//@Entity
//@Table()
//@NamedQueries({
//    @NamedQuery(name="Contact.findAll",query="select c from Contact c"),
//    @NamedQuery(name="Contact.findById",
//            query="select distinct c from Contact c left join fetch c.contactTelDetail t left"
//                    + " join fetch c.hobbies h where c.id=:id")
//})
//public class Contact implements Serializable{
//    
//}
