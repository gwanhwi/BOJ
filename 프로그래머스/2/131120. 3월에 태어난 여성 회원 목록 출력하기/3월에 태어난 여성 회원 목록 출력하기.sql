-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME,GENDER, DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') as DATE_OF_BIRTH
from MEMBER_PROFILE
where DATE_FORMAT(DATE_OF_BIRTH,'%m') = 3 and GENDER = 'W' and TLNO IS NOT NULL
order by MEMBER_ID