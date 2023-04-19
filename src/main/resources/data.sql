INSERT INTO users (username, password, enabled) values('admin', 'admin', true);
INSERT INTO users (username, password, enabled) values('user', 'user', true);

INSERT INTO authorities(user_id, username, authority) values(1, 'admin', 'ROLE_ADMIN');
INSERT INTO authorities(user_id, username, authority) values(2, 'user', 'ROLE_USER');