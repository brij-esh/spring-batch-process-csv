package com.example.springbacth.config;import com.example.springbacth.entity.Customer;import org.springframework.batch.item.ItemProcessor;public class CustomerProcessor implements ItemProcessor<Customer, Customer> {    @Override    public Customer process(Customer item) throws Exception {//        if(item.getCountry().equalsIgnoreCase("United States")) {//            return item;//        }        return item;    }}