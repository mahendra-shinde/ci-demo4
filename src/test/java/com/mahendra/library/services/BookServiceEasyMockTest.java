package com.mahendra.library.services;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.mahendra.library.dao.*;
import com.mahendra.library.models.Book;
import com.mahendra.library.models.Member;
import com.mahendra.library.utils.BookNotAvailableException;
import com.mahendra.library.utils.InvalidMemberException;

@RunWith(EasyMockRunner.class)
public class BookServiceEasyMockTest extends EasyMockSupport{
	
	@Mock private BookDAO dao1;
	@Mock private MemberDAO dao2;
	@Mock private IssueDAO dao3;
	
	private final static Book validBook = new Book(102,"Let us C++","Learn C++",'A');
	private final static Book invalidBook = new Book(101,"Let us C","Learn C",'N');
	private final static Member validMember = new Member(23,"Sachin pilgaonkar","51576572",'A');
	private final static Member invalidMember = new Member(24,"Laxmikant Berde","56561572",'N');
	
	@TestSubject
	private BookService service = new BookService() ;
	
	@After
	public void tearDown() throws Exception {
			service = null;
	}

	@Test(expected=BookNotAvailableException.class)
	public void testIssueNonAvailableBook(){
		EasyMock.expect(dao1.findById(101)).andReturn(invalidBook);
		EasyMock.expect(dao2.findById(23)).andReturn(validMember);
		//EasyMock.expect(dao3.issueBook(101, 23)).andReturn(EasyMock.anyInt());
		EasyMock.replay(dao1);
		EasyMock.replay(dao2);
		service.issueBook(101,23);
		
	}
	

	@Test(expected=InvalidMemberException.class)
	public void testIssueNonAvailableMember(){
		EasyMock.expect(dao1.findById(102)).andReturn(validBook);
		EasyMock.expect(dao2.findById(24)).andReturn(invalidMember);
		EasyMock.replay(dao1);
		EasyMock.replay(dao2);
		
		service.issueBook(102,24);
	}

}
