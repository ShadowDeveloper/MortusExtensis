package net.Inf1nityZ3r0.MortusExtensis;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.client.network.ClientPlayerEntity;

public class SkinRetriever {
    public String GetPlayerSkinTexture(ClientPlayerEntity player) {
        //retrieves the path of the inputted ClientPlayerEntity's skin texture
        GameProfile profile = player.getGameProfile();
        Property textureProperty = profile.getProperties().get("textures").stream().findFirst().orElse(null);
        assert textureProperty != null;
        return textureProperty.getValue();
    }
}
