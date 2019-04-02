package com.codeclan.example.fileTracker;

import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.models.Folder;
import com.codeclan.example.fileTracker.models.User;
import com.codeclan.example.fileTracker.repository.FileRepository;
import com.codeclan.example.fileTracker.repository.FolderRepository;
import com.codeclan.example.fileTracker.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileTrackerApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave() {
		User stacy = new User("Stacy Solomen");
		userRepository.save(stacy);
		Folder folder1 = new Folder("Repossessions", stacy);
		folderRepository.save(folder1);
	}

	@Test
	public void createUserAndFolderAndFileThenSave() {
		User stacy = new User("Stacy Solomen");
		userRepository.save(stacy);
		Folder folder1 = new Folder("Repossessions", stacy);
		folderRepository.save(folder1);
		File file4 = new File("Old Ladies Shop", ".ext", 240, folder1);
		fileRepository.save(file4);

	}
}
