--changeset naveen-01
CREATE TABLE IF NOT EXISTS users (
        id                  INT          GENERATED ALWAYS AS IDENTITY,
        username            VARCHAR(255) NOT NULL,
        name                VARCHAR(255) NOT NULL,
        profile_image_url   TEXT
);

CREATE TABLE IF NOT EXISTS recipes (
        id                  INT          GENERATED ALWAYS AS IDENTITY,
        name                VARCHAR(255) NOT NULL,
        recipe_image_url    TEXT,
        category            TEXT,
        serves              TEXT,
        prep_time           TEXT,
        cook_time           TEXT,
        total_time          TEXT,
        ingredients         TEXT[],
        instructions        TEXT[]
);