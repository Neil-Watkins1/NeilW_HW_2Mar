package com.codeclan.example.fileTracker.components;

import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.models.Folder;
import com.codeclan.example.fileTracker.models.User;
import com.codeclan.example.fileTracker.repository.FileRepository;
import com.codeclan.example.fileTracker.repository.FolderRepository;
import com.codeclan.example.fileTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) throws Exception {

        User brian = new User("Brian");
        userRepository.save(brian);
        User senga = new User("Senga");
        userRepository.save(senga);

        Folder folder2 = new Folder("Dodgy Dealings", brian);
        Folder folder3 = new Folder("Property Deals", senga);
        folderRepository.save(folder2);
        folderRepository.save(folder3);


        File file1 = new File("Office Build", ".doc", 350, folder3);
        File file2 = new File("Shady Council Official", ".doc", 560, folder2);
        fileRepository.save(file1);
        fileRepository.save(file2);


    }
}
