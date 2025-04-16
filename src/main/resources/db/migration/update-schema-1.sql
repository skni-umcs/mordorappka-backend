--liquibase formatted sql
ALTER TABLE classes
    DROP CONSTRAINT fk_classes_period;

ALTER TABLE classes
    DROP CONSTRAINT fk_classes_room;

ALTER TABLE classes
    DROP CONSTRAINT fk_classes_subject;

ALTER TABLE classes
    DROP CONSTRAINT fk_classes_teacher;

ALTER TABLE majors
    DROP CONSTRAINT fk_majors_faculty;

ALTER TABLE rooms
    DROP CONSTRAINT fk_rooms_faculty;

ALTER TABLE subjects
    DROP CONSTRAINT fk_subjects_period;

ALTER TABLE subjects
    DROP CONSTRAINT fk_subjects_term_group;

ALTER TABLE teachers
    DROP CONSTRAINT fk_teachers_faculty;

ALTER TABLE term_groups
    DROP CONSTRAINT fk_term_groups_major;

ALTER TABLE term_groups
    DROP CONSTRAINT fk_term_groups_period;

CREATE TABLE class
(
    class_id           BIGINT                 NOT NULL,
    class_type         VARCHAR(255),
    subject_subject_id BIGINT,
    group_id           VARCHAR(50)            NOT NULL,
    teacher_teacher_id BIGINT                 NOT NULL,
    start_time         time WITHOUT TIME ZONE NOT NULL,
    end_time           time WITHOUT TIME ZONE NOT NULL,
    break_duration     BIGINT                 NOT NULL,
    weekday            INTEGER                NOT NULL,
    room_room_id       BIGINT                 NOT NULL,
    period_period_id   BIGINT                 NOT NULL,
    every_to_weeks     BOOLEAN                NOT NULL,
    CONSTRAINT pk_class PRIMARY KEY (class_id)
);

CREATE TABLE faculty
(
    faculty_id   BIGINT       NOT NULL,
    faculty_name VARCHAR(300) NOT NULL,
    CONSTRAINT pk_faculty PRIMARY KEY (faculty_id)
);

CREATE TABLE major
(
    major_id           BIGINT       NOT NULL,
    major_name         VARCHAR(255) NOT NULL,
    major_degree       VARCHAR(255),
    duration_in_sems   INTEGER,
    faculty_faculty_id BIGINT,
    active             BOOLEAN      NOT NULL,
    CONSTRAINT pk_major PRIMARY KEY (major_id)
);

CREATE TABLE period
(
    period_id     BIGINT     NOT NULL,
    winter_term   BOOLEAN    NOT NULL,
    academic_year VARCHAR(9) NOT NULL,
    CONSTRAINT pk_period PRIMARY KEY (period_id)
);

CREATE TABLE room
(
    room_id            BIGINT      NOT NULL,
    room_number        VARCHAR(10) NOT NULL,
    faculty_faculty_id BIGINT      NOT NULL,
    room_address       VARCHAR(255),
    room_capacity      INTEGER,
    CONSTRAINT pk_room PRIMARY KEY (room_id)
);

CREATE TABLE subject
(
    subject_id               BIGINT       NOT NULL,
    term_group_term_group_id BIGINT       NOT NULL,
    subject_name             VARCHAR(400) NOT NULL,
    period_period_id         BIGINT,
    CONSTRAINT pk_subject PRIMARY KEY (subject_id)
);

CREATE TABLE teacher
(
    teacher_id         BIGINT       NOT NULL,
    teacher_name       VARCHAR(300) NOT NULL,
    teacher_degree     VARCHAR(100) NOT NULL,
    faculty_faculty_id BIGINT       NOT NULL,
    active             BOOLEAN,
    CONSTRAINT pk_teacher PRIMARY KEY (teacher_id)
);

CREATE TABLE term_group
(
    term_group_id    BIGINT  NOT NULL,
    year             INTEGER NOT NULL,
    major_major_id   BIGINT,
    period_period_id BIGINT,
    CONSTRAINT pk_termgroup PRIMARY KEY (term_group_id)
);

ALTER TABLE class
    ADD CONSTRAINT FK_CLASS_ON_PERIOD_PERIODID FOREIGN KEY (period_period_id) REFERENCES period (period_id);

ALTER TABLE class
    ADD CONSTRAINT FK_CLASS_ON_ROOM_ROOMID FOREIGN KEY (room_room_id) REFERENCES room (room_id);

ALTER TABLE class
    ADD CONSTRAINT FK_CLASS_ON_SUBJECT_SUBJECTID FOREIGN KEY (subject_subject_id) REFERENCES subject (subject_id);

ALTER TABLE class
    ADD CONSTRAINT FK_CLASS_ON_TEACHER_TEACHERID FOREIGN KEY (teacher_teacher_id) REFERENCES teacher (teacher_id);

ALTER TABLE major
    ADD CONSTRAINT FK_MAJOR_ON_FACULTY_FACULTYID FOREIGN KEY (faculty_faculty_id) REFERENCES faculty (faculty_id);

ALTER TABLE room
    ADD CONSTRAINT FK_ROOM_ON_FACULTY_FACULTYID FOREIGN KEY (faculty_faculty_id) REFERENCES faculty (faculty_id);

ALTER TABLE subject
    ADD CONSTRAINT FK_SUBJECT_ON_PERIOD_PERIODID FOREIGN KEY (period_period_id) REFERENCES period (period_id);

ALTER TABLE subject
    ADD CONSTRAINT FK_SUBJECT_ON_TERMGROUP_TERMGROUPID FOREIGN KEY (term_group_term_group_id) REFERENCES term_group (term_group_id);

ALTER TABLE teacher
    ADD CONSTRAINT FK_TEACHER_ON_FACULTY_FACULTYID FOREIGN KEY (faculty_faculty_id) REFERENCES faculty (faculty_id);

ALTER TABLE term_group
    ADD CONSTRAINT FK_TERMGROUP_ON_MAJOR_MAJORID FOREIGN KEY (major_major_id) REFERENCES major (major_id);

ALTER TABLE term_group
    ADD CONSTRAINT FK_TERMGROUP_ON_PERIOD_PERIODID FOREIGN KEY (period_period_id) REFERENCES period (period_id);

DROP TABLE classes CASCADE;

DROP TABLE faculties CASCADE;

DROP TABLE majors CASCADE;

DROP TABLE periods CASCADE;

DROP TABLE rooms CASCADE;

DROP TABLE subjects CASCADE;

DROP TABLE teachers CASCADE;

DROP TABLE term_groups CASCADE;