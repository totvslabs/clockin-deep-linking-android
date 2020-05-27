package com.totvs.camera

import androidx.annotation.FloatRange
import androidx.camera.core.CameraSelector
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.totvs.camera.events.Event
import com.totvs.camera.utils.Constants

/**
 * [CameraView] react native manager
 */
class ReactCameraManager : ViewGroupManager<CameraView>() {

    /**
     * React Native view name for the view managed by this manager
     */
    override fun getName() = VIEW_NAME

    /**
     * Create an instance of the view managed by this manager
     */
    @Suppress("MissingPermission")
    override fun createViewInstance(context: ThemedReactContext): CameraView =
        CameraView(context)

    /**
     * Register events
     */
    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any>? {
        val events = mutableMapOf<String, Any>()
        // Event.forEach { e -> ... } will also work or Event.exported.forEach { e -> .. }
        for (e in Event) {
            events[e.name] = mutableMapOf("registrationName" to e.name)
        }
        return events
    }

    // START Setters methods

    /**
     * Set the camera opening facing
     */
    @ReactProp(name = "facing", defaultInt = Constants.CAMERA_FACING_BACK)
    fun setFacing(cameraView: CameraView, @CameraSelector.LensFacing facing: Int) {
        cameraView.facing = if (facing == Constants.CAMERA_FACING_FRONT)
            LensFacing.FRONT
        else
            LensFacing.BACK
    }

    /**
     * Set initial camera zoom
     */
    @ReactProp(name = "zoom", defaultFloat = 0.0f)
    fun setZoom(cameraView: CameraView, @FloatRange(from = 0.0, to = 1.0) zoom: Float) {
        cameraView.zoom = zoom
    }

    // END Setters methods

    companion object {
        /**
         * Name exported to react native. this will work as the component name
         */
        private const val VIEW_NAME = "CameraView"
    }
}