function createSortedList() {
    let list = {
        arr: [],
        size: 0,
        add(element) {
            this.arr.push(element);
            this.arr.sort((a, b) => a - b);
            this.size++;
        },
        get(index) {
            return list.arr[index];
        },
        remove(index) {
            if (index >= 0 && index < this.arr.length) {
                this.arr.splice(index, 1);
                this.size--;
            }
        },
    };
    return list;
}