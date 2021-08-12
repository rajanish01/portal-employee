
CREATE TABLE emp_master (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(35) NOT NULL,
    last_name VARCHAR(35) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    phone VARCHAR(12) NOT NULL,
    emp_id VARCHAR(25) NOT NULL UNIQUE,
    office_id VARCHAR(25) NOT NULL,
    created_on timestamp,
    last_modified_on timestamp
)  ENGINE=INNODB AUTO_INCREMENT=1000;