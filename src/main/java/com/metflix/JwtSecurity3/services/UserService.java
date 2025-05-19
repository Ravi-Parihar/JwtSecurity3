package com.metflix.JwtSecurity3.services;

import com.metflix.JwtSecurity3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

   private List<User> store=new ArrayList<>();

   public UserService() {
      store.add(new User(UUID.randomUUID().toString(), "Ravi Parihar", "ravi@dev.in"));
      store.add(new User(UUID.randomUUID().toString(), "Mohit Sharma", "mohit@dev.in"));
      store.add(new User(UUID.randomUUID().toString(), "Sonu Yadav", "sonu@dev.in"));
      store.add(new User(UUID.randomUUID().toString(), "Vijay Varma", "vijay@dev.in"));
   }

   public List<User> getUsers(){
      return this.store;
   }
}
