-- USERS

INSERT INTO users (id, email, name, password)
VALUES (1, 'uinan@miu.edu', 'umur inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, name, password)
VALUES (2, 'john@miu.edu', 'john doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, name, password)
VALUES (3, 'dean@miu.edu', 'Dean Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO role (id, role)
VALUES (1, 'ADMIN');
INSERT INTO role (id, role)
VALUES (2, 'USER');


INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO users_roles (user_id, roles_id)
VALUES (2, 2);
INSERT INTO users_roles (user_id, roles_id)
VALUES (3, 2);

-- POSTS

INSERT INTO posts(id, author, content, title,user_id)
VALUES(1, 'james', 'awesome', 'iPhone', 1);

INSERT INTO posts(id, author, content, title,user_id)
VALUES( 2, 'jordan', 'amazing', 'iPad', 1);

INSERT INTO posts(id, author, content, title,user_id)
VALUES(3, 'charles', 'wonderful', 'iPhone', 2);

-- COMMENTS

INSERT INTO comments(id, name, post_id)
VALUES(1, 'awesome', 1);

INSERT INTO comments(id, name, post_id)
VALUES(2, 'amazing', 1);

INSERT INTO comments(id, name, post_id)
VALUES(3, 'wonderful', 2);
