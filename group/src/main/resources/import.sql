INSERT INTO GROUPS (ID, TITLE,GOODID,GOODNAME, PRICE, GROUPPRICE) VALUES (1, '恰恰瓜子大特价',1,'恰恰瓜子', 3, 1);
INSERT INTO GROUPS (ID, TITLE,GOODID,GOODNAME, PRICE, GROUPPRICE) VALUES (2, '中南海香烟大特价',8,'中南海', 10, 5);

INSERT INTO GROUPORDERS (ID, GOODID,GOODNAME, COUNT, TOTALPRICE,USERID,GROUP_ID) VALUES (1, 1,'恰恰瓜子', 3, 3,1,1);
-- abc