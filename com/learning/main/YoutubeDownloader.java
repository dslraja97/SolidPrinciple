package com.learning.main;

import java.io.IOException;

public class YoutubeDownloader {

	public static void downaloadVideo(String videoUrl) {
		String command = "yt-dlp -f 'bestaudio[ext=m4a]+bestvideo[height=720]' " + videoUrl;

        try {
            // Run the yt-dlp command
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.inheritIO(); // This will show the yt-dlp output in the console
            Process process = processBuilder.start();

            // Wait for the command to finish
            int exitCode = process.waitFor();

            // Check if the download was successful
            if (exitCode == 0) {
                System.out.println("Video downloaded successfully.");
            } else {
                System.out.println("Error occurred while downloading the video.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

	}
	public static void main(String[] args) {
		// Example YouTube URL (Replace with the URL you want to download)
		String youtubeUrl = "https://youtu.be/V5M2WZiAy6k?si=Fv7NzlQRkUyJvP7b";
		downaloadVideo(youtubeUrl);
	}

}
