import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, List<String>> teamToMembers = new HashMap<>();
        Map<String, String> memberToTeam = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String teamName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            List<String> members = new ArrayList<>();

            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                memberToTeam.put(memberName, teamName);
            }

            Collections.sort(members);
            teamToMembers.put(teamName, members);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                List<String> members = teamToMembers.get(query);
                for (String name : members) {
                    sb.append(name).append("\n");
                }
            } else if (type == 1) {
                sb.append(memberToTeam.get(query)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
