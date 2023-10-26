project("caloriesanalysis")
cmake_minimum_required(VERSION 3.22.1)

set(OpenCV_DIR ${CMAKE_SOURCE_DIR}/OpenCV-android-sdk/sdk/native/jni)
find_package(OpenCV REQUIRED core imgproc)

set(ncnn_DIR ${CMAKE_SOURCE_DIR}/ncnn-20230816-android-vulkan/${ANDROID_ABI}/lib/cmake/ncnn)
find_package(ncnn REQUIRED)

add_library(${CMAKE_PROJECT_NAME} SHARED
    # List C/C++ source files with relative paths to this CMakeLists.txt.
    caloriesanalysis.cpp yolo.cpp ndkcamera.cpp)

target_link_libraries(${CMAKE_PROJECT_NAME} ncnn ${OpenCV_LIBS} camera2ndk mediandk
    # List libraries link to the target library
    android
    log)
