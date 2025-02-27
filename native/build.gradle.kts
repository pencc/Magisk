plugins {
    id("com.android.library")
}

setupCommon()

android {
    namespace = "com.topjohnwu.magisk.native"

    externalNativeBuild {
        ndkBuild {
            path("jni/Android.mk")
        }
    }

    defaultConfig {
        externalNativeBuild {
            ndkBuild {
                // Pass arguments to ndk-build.
                arguments(
                    "B_MAGISK=1", "B_INIT=1", "B_BOOT=1", "B_TEST=1", "B_POLICY=1", "B_PRELOAD=1"
                )
            }
        }
    }
}
