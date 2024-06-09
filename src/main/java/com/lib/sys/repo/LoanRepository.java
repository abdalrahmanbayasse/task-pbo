package com.lib.sys.repo;

import com.lib.sys.entity.Book;
import com.lib.sys.entity.Loan;
import com.lib.sys.entity.Member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByMember(Member member);

    Optional<Loan> findByBookAndReturnDateIsNull(Book book);
}