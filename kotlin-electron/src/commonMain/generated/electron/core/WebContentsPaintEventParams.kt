// Generated by Karakum - do not modify it manually!

package electron.core

external interface WebContentsPaintEventParams {
    /**
     * The GPU shared texture of the frame, when
     * `webPreferences.offscreen.useSharedTexture` is `true`.
     *
     * @experimental
     */
    var texture: OffscreenSharedTexture?
}
