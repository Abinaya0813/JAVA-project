package com.fatigue.app;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.opencv.objdetect.CascadeClassifier;

public class EyeTracker {
    static { System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME); }

    private CascadeClassifier faceDetector;
    private CascadeClassifier eyeDetector;

    public EyeTracker() {
        faceDetector = new CascadeClassifier("src/main/resources/haarcascade_frontalface_default.xml");
        eyeDetector = new CascadeClassifier("src/main/resources/haarcascade_eye.xml");
    }

    public void startTracking() {
        VideoCapture capture = new VideoCapture(0);
        if (!capture.isOpened()) {
            System.out.println("Camera not detected!");
            return;
        }

        Mat frame = new Mat();
        while (capture.read(frame)) {
            // TODO: Face + Eye detection logic here
            System.out.println("Processing frame...");
        }
        capture.release();
    }
}
