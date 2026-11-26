class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<gph> q = new LinkedList<>();
        HashMap<Integer, Integer> vis = new HashMap<>();

        for (int i = 0; i < graph.length; i++) {
            
            if (!vis.containsKey(i)) {
                q.add(new gph(i, 0));

                while (!q.isEmpty()) {
                    gph tr = q.poll();

                    if (vis.containsKey(tr.ver)) {
                        
                        if (vis.get(tr.ver) != tr.clr) {
                            return false;
                        }
                        continue;
                    }

                    vis.put(tr.ver, tr.clr);

                    for (int ngh : graph[tr.ver]) {
                        if (!vis.containsKey(ngh)) {
                            int nxtclr = (tr.clr == 0 ? 1 : 0);
                            q.add(new gph(ngh, nxtclr));
                        }
                    }
                }
            }
        }
        return true;
    }
}

class gph {
    int ver;
    int clr;

    gph(int ver, int clr) {
        this.ver = ver;
        this.clr = clr;
    }
}
