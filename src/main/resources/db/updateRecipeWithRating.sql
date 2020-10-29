--changeset naveen-05
ALTER TABLE recipes ADD COLUMN rating INT DEFAULT 0;
UPDATE recipes SET rating = 4 WHERE id = 1;
UPDATE recipes SET rating = 3 WHERE id = 2;
UPDATE recipes SET rating = 2 WHERE id = 3;
UPDATE recipes SET rating = 5 WHERE id = 4;
UPDATE recipes SET rating = 2 WHERE id = 5;
UPDATE recipes SET rating = 4 WHERE id = 6;
UPDATE recipes SET rating = 4 WHERE id = 7;
UPDATE recipes SET rating = 2 WHERE id = 8;
UPDATE recipes SET rating = 1 WHERE id = 9;
UPDATE recipes SET rating = 2 WHERE id = 10;
UPDATE recipes SET rating = 4 WHERE id = 11;
UPDATE recipes SET rating = 1 WHERE id = 12;
UPDATE recipes SET rating = 3 WHERE id = 13;
UPDATE recipes SET rating = 3 WHERE id = 14;
UPDATE recipes SET rating = 4 WHERE id = 15;