package indi.jackie.leetcode.struct;

/**
 * @author jackie chen
 * @create 2023/3/14
 * @description MinNumberOfHours2383
 */
public class MinNumberOfHours2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result = 0;
        int energySum = initialEnergy;
        int experienceSum = initialExperience;

        int index = 0;
        while (index < energy.length) {
            if (energySum > energy[index] && experienceSum > experience[index]) {
                energySum -= energy[index];
                experienceSum += experience[index];
                index++;
            } else {
                if (energySum <= energy[index]) {
                    result += energy[index] - energySum + 1;
                    energySum = 1;
                } else {
                    energySum -= energy[index];
                }
                if (experienceSum <= experience[index]) {
                    result += experience[index] - experienceSum + 1;
                    experienceSum +=experience[index] + experience[index] - experienceSum + 1;
                } else {
                    experienceSum += experience[index];
                }
                index++;
            }
        }

        return result;
    }
}
