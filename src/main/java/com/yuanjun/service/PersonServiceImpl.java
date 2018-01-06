package com.yuanjun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanjun.bean.Person;
import com.yuanjun.dao.PersonDao;
import com.yuanjun.spring.DynamicDataSourceHolder;
@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public List<Person> findAll() {
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		return personDao.findall();
	}

	public void addPerson(Person person) {
		String dataSourceType = DynamicDataSourceHolder.getDataSourceKey();
		System.out.println(dataSourceType);
		personDao.addPerson(person);
	}

}
