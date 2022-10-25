// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "auth0:index/action:Action":
		r = &Action{}
	case "auth0:index/attackProtection:AttackProtection":
		r = &AttackProtection{}
	case "auth0:index/branding:Branding":
		r = &Branding{}
	case "auth0:index/brandingTheme:BrandingTheme":
		r = &BrandingTheme{}
	case "auth0:index/client:Client":
		r = &Client{}
	case "auth0:index/clientGrant:ClientGrant":
		r = &ClientGrant{}
	case "auth0:index/connection:Connection":
		r = &Connection{}
	case "auth0:index/customDomain:CustomDomain":
		r = &CustomDomain{}
	case "auth0:index/customDomainVerification:CustomDomainVerification":
		r = &CustomDomainVerification{}
	case "auth0:index/email:Email":
		r = &Email{}
	case "auth0:index/emailTemplate:EmailTemplate":
		r = &EmailTemplate{}
	case "auth0:index/globalClient:GlobalClient":
		r = &GlobalClient{}
	case "auth0:index/guardian:Guardian":
		r = &Guardian{}
	case "auth0:index/hook:Hook":
		r = &Hook{}
	case "auth0:index/logStream:LogStream":
		r = &LogStream{}
	case "auth0:index/organization:Organization":
		r = &Organization{}
	case "auth0:index/organizationConnection:OrganizationConnection":
		r = &OrganizationConnection{}
	case "auth0:index/organizationMember:OrganizationMember":
		r = &OrganizationMember{}
	case "auth0:index/prompt:Prompt":
		r = &Prompt{}
	case "auth0:index/promptCustomText:PromptCustomText":
		r = &PromptCustomText{}
	case "auth0:index/resourceServer:ResourceServer":
		r = &ResourceServer{}
	case "auth0:index/role:Role":
		r = &Role{}
	case "auth0:index/rule:Rule":
		r = &Rule{}
	case "auth0:index/ruleConfig:RuleConfig":
		r = &RuleConfig{}
	case "auth0:index/tenant:Tenant":
		r = &Tenant{}
	case "auth0:index/triggerBinding:TriggerBinding":
		r = &TriggerBinding{}
	case "auth0:index/user:User":
		r = &User{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:auth0" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"auth0",
		"index/action",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/attackProtection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/branding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/brandingTheme",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/client",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/clientGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/connection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/customDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/customDomainVerification",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/email",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/emailTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/globalClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/guardian",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/hook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/logStream",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/organizationMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/prompt",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/promptCustomText",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/resourceServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/rule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/ruleConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/tenant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/triggerBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"auth0",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"auth0",
		&pkg{version},
	)
}
