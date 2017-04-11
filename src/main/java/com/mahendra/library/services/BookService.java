	package com.mahendra.library.services;

import java.util.logging.Logger;

import com.mahendra.library.dao.*;
import com.mahendra.library.models.Book;
import com.mahendra.library.models.Member;
import com.mahendra.library.utils.BookNotAvailableException;
import com.mahendra.library.utils.InvalidMemberException;

public class BookService {
private IssueDAO idao;
private BookDAO bdao;
private MemberDAO mdao;

private static Logger log = Logger.getLogger(BookService.class.getName());

public BookService(){}

public BookService(IssueDAO idao, BookDAO bdao, MemberDAO mdao) {
	super();
	this.idao = idao;
	this.bdao = bdao;
	this.mdao = mdao;
}


public void setIdao(IssueDAO idao) {
	this.idao = idao;
}


public void setBdao(BookDAO bdao) {
	this.bdao = bdao;
}




public void setMdao(MemberDAO mdao) {
	this.mdao = mdao;
}

public void issueBook(int bookId, int memberId){
	Member member = mdao.findById(memberId);
	Book book = bdao.findById(bookId);
	log.info("Checking for member");
	if(book.getStatus()=='N')
		throw new BookNotAvailableException(book.getTitle());
	if(member.getStatus()=='N')
		throw new InvalidMemberException(member.getName());
	idao.issueBook(book.getBookId(), member.getMemberId());
	
	log.info("Book issued to member");
}

}
