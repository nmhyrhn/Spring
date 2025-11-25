INSERT INTO member(name, email, age) VALUES ('윤서준', 'SeojunYoon@hanbit.co.kr',10);
INSERT INTO member(name, email, age) VALUES ('윤광철', 'KwangcholYoon@hanbit.co.kr',43);
INSERT INTO member(name, email, age) VALUES ('공미영', 'MiyeongKong@hanbit.co.kr',23);
INSERT INTO member(name, email, age) VALUES ('김도윤', 'DoyunKim@hanbit.co.kr',10);


INSERT INTO article(title, description, created, updated, member_Id)
    VALUES ('첫번째 제목', '첫번째 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,1);
INSERT INTO article(title, description, created, updated, member_Id)
    VALUES ('두번째 제목', '두번째 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,2);
INSERT INTO article(title, description, created, updated, member_Id)
    VALUES ('세번째 제목', '세번째 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,3);
INSERT INTO article(title, description, created, updated, member_Id)
    VALUES ('네번째 제목', '네번째 본문', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,4);