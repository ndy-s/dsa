package hendys.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public class UnionFind {
        private int size;

        private int[] id;
        private int[] sz;

        private int numComponents;

        public UnionFind(int size) {
            this.size = size;

            this.id = new int[size];
            this.sz = new int[size];

            for (int i = 0; i < size; i++) {
                this.id[i] = i;
                this.sz[i] = 1;
            }
        }

        public int find(int p) {
            int[] id = {0, 1, 1, 2, 3, 6};

            int root = p;
            while (root != id[root]) {
                root = id[root];
            }

            while (root != id[p]) {
                int next = id[p];
                id[p] = root;
                p = next;
            }

            System.out.println(Arrays.toString(id));

            return root;
        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        public int componentSize(int p) {
            return sz[find(p)];
        }

        public void union(int p, int q) {
            if (isConnected(p, q)) return;

            if (componentSize(p) < componentSize(q)) {
                sz[find(q)] += sz[find(p)];
                id[find(p)] = id[find(q)];
                sz[find(p)] = 0;
            } else {
                sz[find(p)] += sz[find(q)];
                id[find(q)] = id[find(p)];
                sz[find(q)] = 0;
            }

            this.numComponents--;
        }

        public int[] getId() {
            return this.id;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        UnionFind uf = app.new UnionFind(10);

        System.out.println("Result");
        System.out.println(uf.find(4));
//        System.out.println(Arrays.toString(uf.getId()));
    }
}
