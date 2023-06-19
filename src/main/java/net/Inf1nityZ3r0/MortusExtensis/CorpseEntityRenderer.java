package net.Inf1nityZ3r0.MortusExtensis;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CorpseEntityRenderer extends MobEntityRenderer<CorpseEntity, CorpseEntityModel> {
    public CorpseEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CorpseEntityModel(context.getPart(MortusExtensisClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CorpseEntity entity) {
        return new Identifier("mortusextensis", "textures/entity/corpse/corpse.png");
    }
}
