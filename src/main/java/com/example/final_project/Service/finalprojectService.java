package com.example.final_project.Service;


// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.final_project.Model.User;
import com.example.final_project.Repository.finalprojectRepo;

@Service
public class finalprojectService {

    // @Autowired
    //  finalprojectRepo repo; 
    

    private final finalprojectRepo repo;
    public finalprojectService(finalprojectRepo repo){
        this.repo = repo;
    }

public User signUser(String username, String email, String password){
    if (username == null && password ==null){
        return null;
    }
   else{
    if(repo.findFirstByUsername(username).isPresent()){
        System.out.println("Duplicate username");
        return null;
    }
    User user = new User();
        user.setUsername(username);
         user.setEmail(email);
        user.setPassword(password);
        return repo.save(user);

   }
}

// checking if a user with the provided username and password exists in the repository.
public User authenticate(String username, String password){
    return repo.findByUsernameAndPassword(username, password).orElse(null);
}



// for testing
    // public List<User> getting(){
    //     return repo.findAll();
    // }

    

   
}
