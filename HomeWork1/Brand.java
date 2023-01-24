package org.example;

    enum Brand {
        lenuvo(1),
        asos(2),
        macNote(3),
        eser(4),
        xamiou(5);

        private int id;

        Brand(int name) {
            this.id = name;
        }

        public Integer getId() {
            return this.id;
        }
    }