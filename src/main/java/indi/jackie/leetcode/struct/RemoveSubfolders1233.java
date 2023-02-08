package indi.jackie.leetcode.struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author jackie chen
 * @create 2023/2/8
 * @description RemoveSubfolders1233
 * //todo 这一题可以优化 目前的性能低
 */
public class RemoveSubfolders1233 {

    public static class Folder {
        private String name;

        private List<Folder> subFolders;

        private String fullName;

        Folder(String name, String fullName) {
            this.name = name;
            this.fullName = fullName;
            this.subFolders = new ArrayList<>();
        }
    }

    public List<String> removeSubfolders(String[] folder) {
        Folder resultFolder = new Folder(null, null);
        Arrays.stream(folder).forEach(item -> {
            String[] names = item.split("/");
            handleFolders(resultFolder.subFolders, names, item);
        });

        List<String> result = new ArrayList<>();
        assembleResult(resultFolder.subFolders, result);
        return result;
    }

    private void assembleResult(List<Folder> folders, List<String> result) {
        for (Folder folder : folders) {
            if (folder.fullName != null) {
                result.add(folder.fullName);
            }
            assembleResult(folder.subFolders, result);
        }
    }

    private void handleFolders(List<Folder> currentFolders, String[] names, String fullName) {
        List<Folder> temporaryFolder = currentFolders;
        for (int i = 0; i < names.length; i++) {
            int finalI = i;
            Optional<Folder> folderOptional = temporaryFolder.stream().filter(item -> item.name.equals(names[finalI])).findAny();
            if (folderOptional.isPresent()) {
                Folder folder = folderOptional.get();
                if (folder.fullName != null) {
                    return;
                }
                if (i == names.length - 1) {
                    folder.fullName = fullName;
                    folder.subFolders = new ArrayList<>();
                    return;
                }
                temporaryFolder = folder.subFolders;
            } else {
                Folder folder = new Folder(names[i], null);
                temporaryFolder.add(folder);
                if (i == names.length - 1) {
                    folder.fullName = fullName;
                }
                temporaryFolder = folder.subFolders;
            }
        }
    }
}
