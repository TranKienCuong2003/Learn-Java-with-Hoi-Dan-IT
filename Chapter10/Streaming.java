package Chapter10;

import java.util.ArrayList;
import java.util.List;

class Streaming {
    public static List<String> splitIntoChunks(String binaryData, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i < binaryData.length(); i += chunkSize) {
            int end = Math.min(i + chunkSize, binaryData.length());
            chunks.add(binaryData.substring(i, end));
        }
        return chunks;
    }

    public static void processChunks(List<String> chunks) {
        for (String chunk : chunks) {
            System.out.println("Processing chunk: " + chunk);
        }
    }

    public static void main(String[] args) {
        String binaryData = "101010101110000111110000111100000011111000001110100111010001110101001010000111100011101";
        int chunkSize = 10;
        List<String> chunks = splitIntoChunks(binaryData, chunkSize);
        processChunks(chunks);
    }
}

