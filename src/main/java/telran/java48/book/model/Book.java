package telran.java48.book.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "isbn")
@Builder
@Entity(name = "Sepher")
public class Book {
	@Id
	String isbn;
	String title;
	@ManyToMany //(fetch = FetchType.EAGER)
	@Singular
	Set<Author> authors;

}
