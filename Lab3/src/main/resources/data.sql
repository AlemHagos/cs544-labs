-- USERS

INSERT INTO users
    (id, name)
VALUES
    (1, 'Dani');

INSERT INTO users
    (id, name)
VALUES
    ( 2, 'Selam');

INSERT INTO users
    (id, name)
VALUES
    ( 3, 'Martha');

INSERT INTO users
    ( id, name)
VALUES
    (4, 'Abel');

INSERT INTO users
    (id, name)
VALUES
    (5, 'Sami');

INSERT INTO users
    (id, name)
VALUES
    (6, 'Sara');


-- POSTS

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (1, 'iPhone', 'awesome', 'James', 1);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    ( 2, 'iPad', 'amazing', 'Jackson', 1);

INSERT INTO posts
    (id, author, content, title,user_id)
VALUES
    (3, 'TV', 'wonderful', 'Charles', 2);

-- COMMENTS

INSERT INTO comments
    (id, name, post_id)
VALUES
    (1, 'awesome', 1);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (2, 'amazing', 1);

INSERT INTO comments
    (id, name, post_id)
VALUES
    (3, 'wonderful', 2);
