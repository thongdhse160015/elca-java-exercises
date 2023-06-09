INSERT INTO PROJECT (NAME, FINISHING_DATE)
VALUES
    ('EFV', '2020-04-20'),
    ('CXTRANET', '2020-04-25'),
    ('CRYSTAL BALL', '2020-04-28'),
    ('IOC CLIENT EXTRANET', '2020-06-07'),
    ('TRADEECO', '2020-06-08');

INSERT INTO USER (USERNAME)
VALUES
    ('USER1'),
    ('USER2'),
    ('USER3');

INSERT INTO TASK(NAME, DEADLINE, PROJECT_ID, USER_ID)
VALUES
    ('EFV_TASK_1', '2020-03-05', 1, 1),
    ('EFV_TASK_2', '2020-03-10', 1, 2),
    ('EFV_TASK_3', '2020-03-15', 1, null);