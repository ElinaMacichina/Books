INSERT INTO book (bookId, title, author, year, rating) VALUES (1, 'Spring Boot Basics', 'John Doe', 2021, 4.0);
INSERT INTO book (bookId, title, author, year, rating) VALUES (2, 'The Maze Runner', 'James Dashner', 2009, 4.0);
INSERT INTO book (bookId, title, author, year, rating) VALUES (3, 'Eragon', 'Christopher Paolini', 2002, 3.86);
INSERT INTO book (bookId, title, author, year, rating) VALUES (4, 'The Last Witch in Edinburgh', 'Marielle Thompson', 2024, 3.67);
INSERT INTO book (bookId, title, author, year, rating) VALUES (5, 'The Fellowship of the Ring', 'J.R.R. Tolkien', 1954, 4.33);
INSERT INTO book (bookId, title, author, year, rating) VALUES (6, 'Harry Potter and the Sorcerers Stone', 'J. K. Rowling', 1997, 4.5);

INSERT INTO book_ratings (book_bookId, ratings) VALUES 
    (1, 4),
    (1, 5);
INSERT INTO book_ratings (book_bookId, ratings) VALUES 
    (2, 5),
    (2, 4),
    (2, 3),
    (2, 3),
    (2, 5);

INSERT INTO book_ratings (book_bookId, ratings) VALUES 
    (3, 3),
    (3, 3),
    (3, 5),
    (3, 5),
    (3, 3),
    (3, 4),
    (3, 4);
INSERT INTO book_ratings (book_bookId, ratings) VALUES
    (4, 3),
    (4, 5),
    (4, 3),
    (4, 3),
    (4, 4),
    (4, 4);
INSERT INTO book_ratings (book_bookId, ratings) VALUES    
    (5, 4),
    (5, 5),
    (5, 4),
    (5, 4),
    (5, 4),
    (5, 5);