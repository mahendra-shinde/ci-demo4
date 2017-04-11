package com.mahendra.library.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnit44Runner;

import com.mahendra.library.dao.*;
import com.mahendra.library.models.Book;
import com.mahendra.library.models.Member;
import com.mahendra.library.utils.BookNotAvailableException;
import com.mahendra.library.utils.InvalidMemberException;

public class BookServiceMockitoTest {
	
	@Mock private BookDAO dao1;
	@Mock private MemberDAO dao2;
	@Mock private IssueDAO dao3;
	
	private  Book validBook = new Book(102,"Let us C++","Learn C++",'A');
	private  Book invalidBook = new Book(101,"Let us C","Learn C",'N');
	private  Member validMember = new Member(23,"Sachin pilgaonkar","51576572",'A');
	private  Member invalidMember = new Member(24,"Laxmikant Berde","56561572",'N');
	
	
	private BookService service ;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		System.out.println("Initialized all mocks");
		service = new BookService(dao3,dao1,dao2);
		System.out.println(dao1.hashCode() +" , "+dao2.hashCode()+" , "+dao3.hashCode());
		/*service.setBdao(dao1);
		service.setIdao(dao3);
		service.setMdao(dao2);*/
	}


	@Test(expected=BookNotAvailableException.class)
	public void testIssueNonAvailableBook(){
		Mockito.when(dao1.findById(101)).thenReturn(invalidBook);
		Mockito.when(dao2.findById(23)).thenReturn(validMember);
		
		service.issueBook(101,23);
	}

	@Test(expected=InvalidMemberException.class)
	public void testIssueNonAvailableMember(){
		Mockito.when(dao1.findById(102)).thenReturn(validBook);
		Mockito.when(dao2.findById(24)).thenReturn(invalidMember);
		service.issueBook(102,24);
	}

}
